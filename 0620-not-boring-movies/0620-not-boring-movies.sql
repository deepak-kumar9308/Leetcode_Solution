SELECT id, movie, description, rating
FROM Cinema
WHERE id % 2 = 1 
  AND description <> 'Boring'
ORDER BY rating DESC;